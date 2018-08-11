package examples;

import java.io.*;
import java.text.DecimalFormat;

public class IoBinary {
  public static void main(String[] args) throws IOException {

    DecimalFormat precisionTwo = new DecimalFormat("0.00");
    Customer cust = new Customer();
    cust.name = "Sidney Q. Flarp";
    cust.phone = "555/123-4567";
    cust.number = 98765;
    cust.creditLimit = 1000.00F;

    FileOutputStream binOut = new FileOutputStream("customer.bin");
    DataOutputStream writeOut = new DataOutputStream(binOut);

    writeOut.writeUTF(cust.name);
    writeOut.writeUTF(cust.phone);
    writeOut.writeInt(cust.number);
    writeOut.writeFloat(cust.creditLimit);

    binOut.close();
    Customer custIn = new Customer();

    FileInputStream binIn = new FileInputStream("customer.bin");
    DataInputStream readIn = new DataInputStream(binIn);

    custIn.name = readIn.readUTF();
    System.out.println("Customer name:\t" + custIn.name);
    custIn.phone = readIn.readUTF();
    System.out.println("Customer phone:\t" + custIn.phone);
    custIn.number = readIn.readInt();
    System.out.println("Customer num.:\t" + custIn.number);
    custIn.creditLimit = readIn.readFloat();
    System.out.println("Credit limit:\t" +
      precisionTwo.format(custIn.creditLimit));
    
    binIn.close();
  }
}

