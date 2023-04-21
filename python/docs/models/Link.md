# belvo_client.model.link.Link

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current Link. | [optional] value must be a uuid
**institution** | str,  | str,  | Belvo&#x27;s name for the institution.  | [optional] 
**access_mode** | [**EnumLinkAccessModeResponse**](EnumLinkAccessModeResponse.md) | [**EnumLinkAccessModeResponse**](EnumLinkAccessModeResponse.md) |  | [optional] 
**last_accessed_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of Belvo&#x27;s most recent successful access to the institution for the given link. | [optional] value must conform to RFC-3339 date-time
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**external_id** | None, str,  | NoneClass, str,  | The &#x60;external_id&#x60; you provided as an additional identifier for the link. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier). | [optional] 
**institution_user_id** | str,  | str,  | &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info:&lt;/strong&gt; Only applicable for links created &lt;b&gt;after 08-02-2022&lt;/b&gt;. &lt;/div&gt;  A unique 44-character string that can be used to identify a user at a given institution.  📚 Check out our [Avoiding duplicated links](https://developers.belvo.com/docs/link-creation-best-practices#avoiding-duplicated-links) DevPortal article for more information and tips on how to use it. | [optional] 
**status** | [**EnumLinkStatus**](EnumLinkStatus.md) | [**EnumLinkStatus**](EnumLinkStatus.md) |  | [optional] 
**created_by** | str, uuid.UUID,  | str,  | The unique ID for the user that created this link. | [optional] value must be a uuid
**refresh_rate** | [**EnumLinkRefreshRate**](EnumLinkRefreshRate.md) | [**EnumLinkRefreshRate**](EnumLinkRefreshRate.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

