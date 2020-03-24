package lr.ng.service;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import lr.ng.entities.Report;

/**
 * ReportingService
 */
@ApplicationScoped
public class ReportService {

    @Transactional
    public Report getReport() {
        Report report = Report.findById(1l);
        return report;
    }
    
}