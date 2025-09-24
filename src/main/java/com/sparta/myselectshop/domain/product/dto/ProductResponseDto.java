package com.sparta.myselectshop.domain.product.dto;

import com.sparta.myselectshop.domain.folder.dto.FolderResponseDto;
import com.sparta.myselectshop.domain.product.entity.Product;
import com.sparta.myselectshop.domain.productfolder.entity.ProductFolder;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductResponseDto {

    private Long id;
    private String title;
    private String link;
    private String image;
    private int lprice;
    private int myprice;

    private List<FolderResponseDto> productFolderList = new ArrayList<>();

    public ProductResponseDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.link = product.getLink();
        this.image = product.getImage();
        this.lprice = product.getLprice();
        this.myprice = product.getMyprice();
        for (ProductFolder productFolder : product.getProductFolerList()) {
            productFolderList.add(new FolderResponseDto(productFolder.getFolder()));
        }
    }
}