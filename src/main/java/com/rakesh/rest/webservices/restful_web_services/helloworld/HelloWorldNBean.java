package com.rakesh.rest.webservices.restful_web_services.helloworld;

public class HelloWorldNBean {
    private String message;

    public HelloWorldNBean(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldNBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
