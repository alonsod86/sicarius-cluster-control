package fs.sicarius.cluster.web.rest.util;

import org.springframework.http.HttpHeaders;

/**
 * Utility class for http header creation.
 *
 */
public class HeaderUtil {
 
    public static HttpHeaders createAlert(String message, String param) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-clusterApp-alert", message);
        headers.add("X-clusterApp-params", param);
        return headers;
    }
    
    public static HttpHeaders createEntityCreationAlert(String entityName, String param) {
        return createAlert("clusterApp." + entityName + ".created", param);
    }

    public static HttpHeaders createEntityUpdateAlert(String entityName, String param) {
        return createAlert("clusterApp." + entityName + ".updated", param);
    }

    public static HttpHeaders createEntityDeletionAlert(String entityName, String param) {
        return createAlert("clusterApp." + entityName + ".deleted", param);
    }

}