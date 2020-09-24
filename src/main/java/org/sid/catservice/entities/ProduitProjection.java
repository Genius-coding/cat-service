package org.sid.catservice.entities;

import org.sid.catservice.entities.Produit;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Produit.class)
public interface ProduitProjection {
    public String getDesignation();
    public double getPrice();
}
