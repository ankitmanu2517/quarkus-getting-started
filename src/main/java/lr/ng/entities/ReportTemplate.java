package lr.ng.entities;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * ReportTemplate
 */
@Entity
public class ReportTemplate extends PanacheEntity{

    private Integer reportTemplateId;
    private String name;
    private String description;
    private String columns;
    private String group1;
    private String group2;
    private String group3;
    private String layout;
        
}