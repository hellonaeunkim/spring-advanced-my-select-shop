package com.sparta.myselectshop.domain.folder.dto;

import com.sparta.myselectshop.domain.folder.entity.Folder;
import lombok.Getter;

@Getter
public class FolderResponseDto {

    private Long id;
    private String name;

    public FolderResponseDto(Folder folder) {
        this.id = folder.getId();
        this.name = folder.getName();
    }
}