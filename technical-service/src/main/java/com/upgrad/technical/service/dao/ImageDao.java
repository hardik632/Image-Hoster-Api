package com.upgrad.technical.service.dao;

import com.upgrad.technical.service.entity.ImageEntity;
import com.upgrad.technical.service.entity.UserAuthTokenEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class ImageDao {

    @PersistenceContext
    private EntityManager entityManager;

    public ImageEntity createImage(ImageEntity imageEntity) {
        entityManager.persist(imageEntity);
    }

    public UserAuthTokenEntity getUserAuthToken(final String accesstoken) {
    }

    public ImageEntity getImage(final String imageUuid) {
    }

    public ImageEntity getImageById(final long Id) {
    }

    public ImageEntity updateImage(final ImageEntity imageEntity) {

    }
}
