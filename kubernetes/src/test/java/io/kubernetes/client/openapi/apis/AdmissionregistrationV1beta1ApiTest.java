/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfiguration;
import io.kubernetes.client.openapi.models.V1beta1MutatingWebhookConfigurationList;
import io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookConfiguration;
import io.kubernetes.client.openapi.models.V1beta1ValidatingWebhookConfigurationList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdmissionregistrationV1beta1Api
 */
@Ignore
public class AdmissionregistrationV1beta1ApiTest {

    private final AdmissionregistrationV1beta1Api api = new AdmissionregistrationV1beta1Api();

    
    /**
     * 
     *
     * create a MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMutatingWebhookConfigurationTest() throws ApiException {
        V1beta1MutatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1MutatingWebhookConfiguration response = api.createMutatingWebhookConfiguration(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createValidatingWebhookConfigurationTest() throws ApiException {
        V1beta1ValidatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1ValidatingWebhookConfiguration response = api.createValidatingWebhookConfiguration(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionMutatingWebhookConfigurationTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteCollectionMutatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionValidatingWebhookConfigurationTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteCollectionValidatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteMutatingWebhookConfiguration(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteValidatingWebhookConfiguration(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMutatingWebhookConfigurationTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1MutatingWebhookConfigurationList response = api.listMutatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listValidatingWebhookConfigurationTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1ValidatingWebhookConfigurationList response = api.listValidatingWebhookConfiguration(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchMutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1beta1MutatingWebhookConfiguration response = api.patchMutatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1beta1ValidatingWebhookConfiguration response = api.patchValidatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readMutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1MutatingWebhookConfiguration response = api.readMutatingWebhookConfiguration(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1ValidatingWebhookConfiguration response = api.readValidatingWebhookConfiguration(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified MutatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceMutatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        V1beta1MutatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1MutatingWebhookConfiguration response = api.replaceMutatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ValidatingWebhookConfiguration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceValidatingWebhookConfigurationTest() throws ApiException {
        String name = null;
        V1beta1ValidatingWebhookConfiguration body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1ValidatingWebhookConfiguration response = api.replaceValidatingWebhookConfiguration(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
