package com.nfeeds.adapter.contentmanager.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TopicsRemoteCallService {

    @Value("${nfeeds.dl.topics.url}")
    private String baseUrl;
}
