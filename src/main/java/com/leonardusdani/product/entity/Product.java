/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonardusdani.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author machine
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProductId", query = "SELECT p FROM Product p WHERE p.productId = :productId")
    , @NamedQuery(name = "Product.findBySku", query = "SELECT p FROM Product p WHERE p.sku = :sku")
    , @NamedQuery(name = "Product.findBySupplierProductId", query = "SELECT p FROM Product p WHERE p.supplierProductId = :supplierProductId")
    , @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName")
    , @NamedQuery(name = "Product.findByProductDescription", query = "SELECT p FROM Product p WHERE p.productDescription = :productDescription")
    , @NamedQuery(name = "Product.findBySupplierId", query = "SELECT p FROM Product p WHERE p.supplierId = :supplierId")
    , @NamedQuery(name = "Product.findByCategoryId", query = "SELECT p FROM Product p WHERE p.categoryId = :categoryId")
    , @NamedQuery(name = "Product.findByQuantityPerUnit", query = "SELECT p FROM Product p WHERE p.quantityPerUnit = :quantityPerUnit")
    , @NamedQuery(name = "Product.findByUnitSize", query = "SELECT p FROM Product p WHERE p.unitSize = :unitSize")
    , @NamedQuery(name = "Product.findByUnitPrice", query = "SELECT p FROM Product p WHERE p.unitPrice = :unitPrice")
    , @NamedQuery(name = "Product.findByMsrp", query = "SELECT p FROM Product p WHERE p.msrp = :msrp")
    , @NamedQuery(name = "Product.findByAvailableSize", query = "SELECT p FROM Product p WHERE p.availableSize = :availableSize")
    , @NamedQuery(name = "Product.findByAvailableColors", query = "SELECT p FROM Product p WHERE p.availableColors = :availableColors")
    , @NamedQuery(name = "Product.findBySizeId", query = "SELECT p FROM Product p WHERE p.sizeId = :sizeId")
    , @NamedQuery(name = "Product.findByColorId", query = "SELECT p FROM Product p WHERE p.colorId = :colorId")
    , @NamedQuery(name = "Product.findByDiscount", query = "SELECT p FROM Product p WHERE p.discount = :discount")
    , @NamedQuery(name = "Product.findByUnitWeight", query = "SELECT p FROM Product p WHERE p.unitWeight = :unitWeight")
    , @NamedQuery(name = "Product.findByUnitInStock", query = "SELECT p FROM Product p WHERE p.unitInStock = :unitInStock")
    , @NamedQuery(name = "Product.findByUnitsOnOrder", query = "SELECT p FROM Product p WHERE p.unitsOnOrder = :unitsOnOrder")
    , @NamedQuery(name = "Product.findByReorderLevel", query = "SELECT p FROM Product p WHERE p.reorderLevel = :reorderLevel")
    , @NamedQuery(name = "Product.findByProductAvailable", query = "SELECT p FROM Product p WHERE p.productAvailable = :productAvailable")
    , @NamedQuery(name = "Product.findByDiscountAvailable", query = "SELECT p FROM Product p WHERE p.discountAvailable = :discountAvailable")
    , @NamedQuery(name = "Product.findByCurrentOrder", query = "SELECT p FROM Product p WHERE p.currentOrder = :currentOrder")
    , @NamedQuery(name = "Product.findByPicture", query = "SELECT p FROM Product p WHERE p.picture = :picture")
    , @NamedQuery(name = "Product.findByRanking", query = "SELECT p FROM Product p WHERE p.ranking = :ranking")
    , @NamedQuery(name = "Product.findByNote", query = "SELECT p FROM Product p WHERE p.note = :note")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Size(max = 50)
    @Column(name = "sku")
    private String sku;
    @Size(max = 50)
    @Column(name = "supplier_product_id")
    private String supplierProductId;
    @Size(max = 50)
    @Column(name = "product_name")
    private String productName;
    @Size(max = 50)
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "supplier_id")
    private Integer supplierId;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "quantity_per_unit")
    private Integer quantityPerUnit;
    @Size(max = 20)
    @Column(name = "unit_size")
    private String unitSize;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "msrp")
    private BigDecimal msrp;
    @Size(max = 50)
    @Column(name = "available_size")
    private String availableSize;
    @Size(max = 50)
    @Column(name = "available_colors")
    private String availableColors;
    @Column(name = "size_id")
    private Integer sizeId;
    @Column(name = "color_id")
    private Integer colorId;
    @Column(name = "discount")
    private Short discount;
    @Column(name = "unit_weight")
    private Float unitWeight;
    @Column(name = "unit_in_stock")
    private Short unitInStock;
    @Column(name = "units_on_order")
    private Short unitsOnOrder;
    @Column(name = "reorder_level")
    private Short reorderLevel;
    @Column(name = "product_available")
    private Boolean productAvailable;
    @Column(name = "discount_available")
    private Boolean discountAvailable;
    @Column(name = "current_order")
    private Boolean currentOrder;
    @Size(max = 50)
    @Column(name = "picture")
    private String picture;
    @Column(name = "ranking")
    private Integer ranking;
    @Size(max = 255)
    @Column(name = "note")
    private String note;

    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSupplierProductId() {
        return supplierProductId;
    }

    public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(Integer quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public String getUnitSize() {
        return unitSize;
    }

    public void setUnitSize(String unitSize) {
        this.unitSize = unitSize;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getMsrp() {
        return msrp;
    }

    public void setMsrp(BigDecimal msrp) {
        this.msrp = msrp;
    }

    public String getAvailableSize() {
        return availableSize;
    }

    public void setAvailableSize(String availableSize) {
        this.availableSize = availableSize;
    }

    public String getAvailableColors() {
        return availableColors;
    }

    public void setAvailableColors(String availableColors) {
        this.availableColors = availableColors;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Short getDiscount() {
        return discount;
    }

    public void setDiscount(Short discount) {
        this.discount = discount;
    }

    public Float getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Float unitWeight) {
        this.unitWeight = unitWeight;
    }

    public Short getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(Short unitInStock) {
        this.unitInStock = unitInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Boolean getProductAvailable() {
        return productAvailable;
    }

    public void setProductAvailable(Boolean productAvailable) {
        this.productAvailable = productAvailable;
    }

    public Boolean getDiscountAvailable() {
        return discountAvailable;
    }

    public void setDiscountAvailable(Boolean discountAvailable) {
        this.discountAvailable = discountAvailable;
    }

    public Boolean getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Boolean currentOrder) {
        this.currentOrder = currentOrder;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.leonardusdani.product.entity.Product[ productId=" + productId + " ]";
    }
    
}
