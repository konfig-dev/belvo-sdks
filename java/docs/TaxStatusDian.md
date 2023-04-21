

# TaxStatusDian


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Status. |  |
|**link** | **UUID** | The &#x60;link.id&#x60; that the tax status is associated with. |  |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**placeAndDateOfIssuance** | **String** | The date when the tax status was issued. For example, &#x60;2020-08-05/18:55:16&#x60;. |  |
|**officialName** | **String** | The name of the business.  Note: For individuals in Colombia, this field will return &#x60;null&#x60;.  |  |
|**idCif** | **String** | The taxpayer&#39;s *Cédula de ciudadanía* (CC) ID. Only applicable for individuals.  |  |
|**taxPayerInformation** | [**TaxStatusTaxPayerInformationDian**](TaxStatusTaxPayerInformationDian.md) |  |  |
|**address** | [**TaxStatusAddressDian**](TaxStatusAddressDian.md) |  |  |
|**economicActivity** | [**List&lt;TaxStatusEconomicActivityDian&gt;**](TaxStatusEconomicActivityDian.md) | A list of economic activity objects.  |  |
|**regimens** | [**List&lt;TaxStatusRegimensDian&gt;**](TaxStatusRegimensDian.md) | A list of regimen objects.  |  [optional] |
|**obligations** | [**List&lt;TaxStatusObligationsDian&gt;**](TaxStatusObligationsDian.md) | Details regarding a business&#39;s obligations.  ℹ️ For non-business accounts, this field will return empty.  |  |
|**digitalStamp** | **String** | The validation certificate of the document. |  |
|**digitalStampChain** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  |
|**pdf** | **File** | Tax status PDF as a binary string. |  |



