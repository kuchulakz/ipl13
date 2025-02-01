package com.wecp.progressive.exception;

<<<<<<< HEAD
public class NoMatchesFoundException {
=======
public class NoMatchesFoundException extends RuntimeException{

    public NoMatchesFoundException(String message)
    {
        super(message);
    }
>>>>>>> f48438c5f1295041d2d35954bed7e0c42bcc99c2
}