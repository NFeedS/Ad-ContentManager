package com.nfeeds.adapter.contentmanager.controller;

import com.nfeeds.adapter.contentmanager.services.ContentManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/contentmanager")
public class ContentManagerController {

    private final ContentManagerService contentManagerService;

    public ContentManagerController(ContentManagerService contentManagerService) {
        this.contentManagerService = contentManagerService;
    }
}
