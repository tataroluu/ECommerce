package com.bilgeadam.eCommerce.Service;
import com.bilgeadam.proto.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EcommerceService extends EcommerceServiceGrpc.EcommerceServiceImplBase {

    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        GreetingRequest.newBuilder().setName("Berra").build();

        responseObserver.onNext(GreetingResponse.newBuilder().setMessage("Hello " + request.getName()).build());
        responseObserver.onCompleted();
    }
}
