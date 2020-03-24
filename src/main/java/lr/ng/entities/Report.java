package lr.ng.entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * Report
 */
@Entity
@Table(name = "lrng_content_report")
public class Report extends PanacheEntity {

	
	@Column(name = "repot_id")
    private String reportId;

    @Column(name = "name")
    private String name;

    @Column(name = "qualifier1")
    private String qualifier1;

    @Column(name = "qualifier2")
    private String qualifier2;

    @Column(name = "description")
    private String description;

    @Column(name = "data_source")
    private Integer dataSource;

    @Column(name = "filter_criteria")
    private String filterCriteria;

    @Column(name = "log_source_criteria")
    private String logSourceCriteria;

    @Column(name = "report_templat_id")
    private Integer reportTemplateId;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualifier1() {
		return qualifier1;
	}
	public void setQualifier1(String qualifier1) {
		this.qualifier1 = qualifier1;
	}
	public String getQualifier2() {
		return qualifier2;
	}
	public void setQualifier2(String qualifier2) {
		this.qualifier2 = qualifier2;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDataSource() {
		return dataSource;
	}
	public void setDataSource(Integer dataSource) {
		this.dataSource = dataSource;
	}
	public String getFilterCriteria() {
		return filterCriteria;
	}
	public void setFilterCriteria(String filterCriteria) {
		this.filterCriteria = filterCriteria;
	}
	public String getLogSourceCriteria() {
		return logSourceCriteria;
	}
	public void setLogSourceCriteria(String logSourceCriteria) {
		this.logSourceCriteria = logSourceCriteria;
	}
	public Integer getReportTemplateId() {
		return reportTemplateId;
	}
	public void setReportTemplateId(Integer reportTemplateId) {
		this.reportTemplateId = reportTemplateId;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

    

}