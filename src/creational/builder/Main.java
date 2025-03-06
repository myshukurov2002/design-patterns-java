package creational.builder;

import jdk.internal.net.http.HttpClientBuilderImpl;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {
//        Computer computer = new Computer
//                .ComputerBuilder("16", "1tb")
//                .setGPU(true)
//                .build();
//
//        System.out.println(computer);

        ComputerV2 computerV2 = new ComputerV2
                .ComputerBuilder()
                .setHDD("512gb")
                .build();

        System.out.println(computerV2);


    }
}
