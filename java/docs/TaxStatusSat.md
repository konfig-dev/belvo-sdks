

# TaxStatusSat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Status. |  |
|**link** | **UUID** | The &#x60;link.id&#x60; that the tax status is associated with. |  |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**placeAndDateOfIssuance** | **String** | The place and date of that the tax status was issued. |  |
|**officialName** | **String** | The name of the person or business. |  |
|**idCif** | **String** | The taxpayer&#39;s *Cédula de Identificación Fiscal* (CIF) ID.  |  |
|**taxPayerInformation** | [**TaxStatusTaxPayerInformationSat**](TaxStatusTaxPayerInformationSat.md) |  |  |
|**address** | [**TaxStatusAddressSat**](TaxStatusAddressSat.md) |  |  |
|**economicActivity** | [**List&lt;TaxStatusEconomicActivitySat&gt;**](TaxStatusEconomicActivitySat.md) | A list of economic activity objects.  |  |
|**regimens** | [**List&lt;TaxStatusRegimensSat&gt;**](TaxStatusRegimensSat.md) | A list of regimen objects.  |  [optional] |
|**obligations** | [**List&lt;TaxStatusObligationsSat&gt;**](TaxStatusObligationsSat.md) | Details regarding a business&#39;s obligations.  ℹ️ For non-business accounts, this field will return empty.  |  |
|**digitalStamp** | **String** | The validation certificate of the document. |  |
|**digitalStampChain** | **String** | A data chain containing the basic structure of a fiscal digital check. For Mexico, this is the *Comprobante Fiscal Digital por Internet* (CFDI).  |  |
|**pdf** | **File** | Tax status PDF as a binary string. |  |



