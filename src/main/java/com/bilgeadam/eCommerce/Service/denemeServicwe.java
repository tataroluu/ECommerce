package com.bilgeadam.eCommerce.Service;

import com.bilgeadam.eCommerce.Model.deneme;
import com.bilgeadam.eCommerce.Repository.denemeRepo;
import com.bilgeadam.proto.EcommerceServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class denemeServicwe {

    @Autowired
    private denemeRepo denemeRepo;

    @GrpcClient("ecommerce")
    private EcommerceServiceGrpc.EcommerceServiceBlockingStub ecommerceServiceBlockingStub;

    public List<deneme> getAllMoviesService() {

        return denemeRepo.getAllUsersRepository();
    }

}
