

# TaxStatusTaxPayerInformationSat

Details regarding the taxpayer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rfc** | **String** | The tax payers&#39;s identification number (For Mexico, this is the RFC).  |  |
|**curp** | **String** | The tax payers&#39;s *Clave Única de Registro de Población* (CURP) number.  |  [optional] |
|**name** | **String** | The tax payers&#39;s first name. |  [optional] |
|**firstLastName** | **String** | The tax payers&#39;s first last name. |  [optional] |
|**secondLastName** | **String** | The tax payers&#39;s second last name. |  [optional] |
|**startOperationsDate** | **LocalDate** | Date when the tax payer commenced taxable commercial activities.  |  |
|**statusPadron** | **String** | Status of the taxpayer in the Federal Register of Taxpayers (RFC). Can be &#x60;ACTIVO&#x60; or &#x60;INACTIVO&#x60;. |  |
|**lastStatusChangeDate** | **LocalDate** | Date when &#x60;status_padron&#x60; was most recently updated.  |  |
|**commercialName** | **String** | The name of the business designated for consumers and the general public.  **Note**: Only applicable for businesses.  |  [optional] |
|**socialName** | **String** | The unique and exclusive name within the national territory that companies receive for legal or administrative purposes. **Note**: Only applicable for businesses. |  [optional] |
|**email** | **String** | Contact email address for the tax payer. |  [optional] |
|**phone** | **String** | Contact phone number for the tax payer. |  [optional] |



