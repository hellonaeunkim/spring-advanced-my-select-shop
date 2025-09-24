package com.sparta.myselectshop.domain.productfolder.repository;

import com.sparta.myselectshop.domain.folder.entity.Folder;
import com.sparta.myselectshop.domain.product.entity.Product;
import com.sparta.myselectshop.domain.productfolder.entity.ProductFolder;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {

    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
