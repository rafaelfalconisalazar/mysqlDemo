package com.unibe.example.mysqlDemo.resources.exeptions;

public class CustomerAllreadyExistExeption extends Exception {
    private static final long serialVersionUID = -7717691994704695707L;
    public static final String DESCRIPTION = "Customer Already Exist";

    public CustomerAllreadyExistExeption(){
        super(DESCRIPTION);
    }

    public CustomerAllreadyExistExeption(String detail){
        super(DESCRIPTION+ " , " + detail);
    }
}
