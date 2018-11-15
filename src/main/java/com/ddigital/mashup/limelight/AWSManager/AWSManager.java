package com.ddigital.mashup.limelight.AWSManager;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class AWSManager {

    AWSCredentials credentials;
    AmazonS3 s3client;

    public AWSManager() {
        credentials = new BasicAWSCredentials(
                System.getenv("name"), System.getenv("Accesskey")
        );

        s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.EU_WEST_1)
                .build();

    }

}
