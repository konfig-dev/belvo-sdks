# belvo_client.model.enum_link_refresh_rate.EnumLinkRefreshRate

The update refresh rate for the recurrent link. For more information, check out our [recurrent link documentation](https://developers.belvo.com/docs/links-and-institutions#recurrent-links) in our DevPortal. We return one of the following enum values:   - `6h`   - `12h`   - `24h`   - `7d` (default)   - `30d` (once a month)   - `null` (for single links) 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  | The update refresh rate for the recurrent link. For more information, check out our [recurrent link documentation](https://developers.belvo.com/docs/links-and-institutions#recurrent-links) in our DevPortal. We return one of the following enum values:   - &#x60;6h&#x60;   - &#x60;12h&#x60;   - &#x60;24h&#x60;   - &#x60;7d&#x60; (default)   - &#x60;30d&#x60; (once a month)   - &#x60;null&#x60; (for single links)  | must be one of ["6h", "12h", "24h", "7d", "30d", None, ] if omitted the server will use the default value of "7d"

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

