package com.nfeeds.adapter.contentmanager.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessagesRemoteCallService {

    @Value("${nfeeds.dl.messages.url}")
    private String baseUrl;
}
