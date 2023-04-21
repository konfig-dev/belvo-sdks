

# Account

Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier created by Belvo used to reference the current account. |  [optional] |
|**link** | **String** | The &#x60;link.id&#x60; the account belongs to. |  [optional] |
|**institution** | [**InstitutionAccount**](InstitutionAccount.md) |  |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**category** | **EnumAccountCategory** |  |  |
|**balanceType** | **String** | Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative.  |  |
|**type** | **String** | The account type, as designated by the institution. |  |
|**name** | **String** | The account name, as given by the institution. |  |
|**number** | **String** | The account number, as designated by the institution. |  |
|**balance** | [**AccountsBalance**](AccountsBalance.md) |  |  |
|**currency** | **String** | The currency of the account. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. |  |
|**publicIdentificationName** | **String** | The public name for the type of identification. For example: &#x60;\&quot;CLABE\&quot;&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be &#x60;AGENCY/ACCOUNT&#x60;.  |  |
|**publicIdentificationValue** | **String** | The value for the &#x60;public_identification_name&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash. For example: &#x60;0444/45722-0&#x60;.  |  |
|**lastAccessedAt** | **OffsetDateTime** | The ISO-8601 timestamp of Belvo&#39;s most recent successful access to the institution for the given link. |  |
|**creditData** | [**AccountsCreditData**](AccountsCreditData.md) |  |  |
|**loanData** | [**AccountsLoanData**](AccountsLoanData.md) |  |  |
|**fundsData** | [**List&lt;AccountsFundsData&gt;**](AccountsFundsData.md) | One or more funds that contribute to the the pension account. |  [optional] |
|**receivablesData** | [**AccountsReceivablesData**](AccountsReceivablesData.md) |  |  [optional] |
|**bankProductId** | **String** | *This field has been deprecated.*  *The institution&#39;s product ID for the account type.*  |  [optional] |
|**internalIdentification** | **String** | *This field has been deprecated.*  *The institution&#39;s internal identification for the account.*  |  [optional] |



