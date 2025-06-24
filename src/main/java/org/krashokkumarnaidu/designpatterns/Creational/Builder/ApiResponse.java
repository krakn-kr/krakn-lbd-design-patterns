package org.krashokkumarnaidu.designpatterns.Creational.Builder;

public class ApiResponse {
    private int status;
    private String message;
    private Object data;

    public ApiResponse(Builder builder) {
        this.status = builder.status;
        this.message = builder.message;
        this.data = builder.data;
    }
    public static class Builder{
        private int status;
        private String message;
        private Object data;

        public Builder status(int status){
            this.status = status;
            return this;
        }
        public Builder message(String message){
            this.message = message;
            return this;
        }
        public Builder data(Object data){
            this.data = data;
            return this;
        }
        public ApiResponse build(){
            return new ApiResponse(this);
        }
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        ApiResponse apiResponse = new ApiResponse.Builder()
                .status(200)
                .message("OK")
                .build();
        System.out.println(apiResponse);
    }
}
