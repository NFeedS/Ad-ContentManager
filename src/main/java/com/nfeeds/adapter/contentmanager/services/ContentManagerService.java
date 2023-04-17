package com.nfeeds.adapter.contentmanager.services;

import org.springframework.stereotype.Service;

@Service
public class ContentManagerService {

    private final MessagesRemoteCallService messagesRemoteCallService;
    private final TopicsRemoteCallService topicsRemoteCallService;

    public ContentManagerService(MessagesRemoteCallService messagesRemoteCallService, TopicsRemoteCallService topicsRemoteCallService) {
        this.messagesRemoteCallService = messagesRemoteCallService;
        this.topicsRemoteCallService = topicsRemoteCallService;
    }
}
