

# Link


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current Link. |  [optional] |
|**institution** | **String** | Belvo&#39;s name for the institution.  |  [optional] |
|**accessMode** | **EnumLinkAccessModeResponse** |  |  [optional] |
|**lastAccessedAt** | **OffsetDateTime** | The ISO-8601 timestamp of Belvo&#39;s most recent successful access to the institution for the given link. |  [optional] |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**externalId** | **String** | The &#x60;external_id&#x60; you provided as an additional identifier for the link. For more information, see our [Link creation article](https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier). |  [optional] |
|**institutionUserId** | **String** | &lt;div style&#x3D;\&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px\&quot;&gt; &lt;strong&gt;Info:&lt;/strong&gt; Only applicable for links created &lt;b&gt;after 08-02-2022&lt;/b&gt;. &lt;/div&gt;  A unique 44-character string that can be used to identify a user at a given institution.  📚 Check out our [Avoiding duplicated links](https://developers.belvo.com/docs/link-creation-best-practices#avoiding-duplicated-links) DevPortal article for more information and tips on how to use it. |  [optional] |
|**status** | **EnumLinkStatus** |  |  [optional] |
|**createdBy** | **UUID** | The unique ID for the user that created this link. |  [optional] |
|**refreshRate** | **EnumLinkRefreshRate** |  |  [optional] |



