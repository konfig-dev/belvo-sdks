

# InvoiceSenderDetailsDian

Details regarding the sender. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |
|**taxPayerType** | **String** | Indicates if the sender is a business or an individual. Can be either:      - &#x60;Persona Jurídica&#x60;   - &#x60;Persona Natural&#x60;  |  [optional] |
|**regimen** | **String** | The sender&#39;s regimen type.  For detailed information regarding DIAN&#39;s regimens, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).   |  [optional] |
|**taxScheme** | **String** | The sender&#39;s fiscal responsibilities.  For detailed information regarding DIAN&#39;s tax schemes, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).   |  [optional] |
|**country** | **String** | The country where the sender pays their taxes.  |  [optional] |
|**address** | **String** | The sender&#39;s address.  |  [optional] |
|**phoneNumber** | **String** | The sender&#39;s phone number.  |  [optional] |
|**email** | **String** | The sender&#39;s email address.  |  [optional] |



