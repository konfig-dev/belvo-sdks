

# InvestmentsPortfolio


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current portfolio. |  [optional] |
|**name** | **String** | The name of the portfolio, as given in the institution.  |  |
|**type** | **EnumInvestmentPortfolioType** |  |  |
|**balanceType** | **String** | Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative.  |  [optional] |
|**balanceGross** | **Float** | The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution.  |  |
|**balanceNet** | **Float** | The total current value of the entire portfolio and all its underlying instruments, as given by the institution.  ℹ️ **Note:** In Brazil, this is usually calculated based on the net value (that is, not including tax).  |  |
|**currency** | **String** | The currency of the portfolio. For example:   - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned.  |  |
|**instruments** | [**List&lt;InvestmentsPortfolioInstrument&gt;**](InvestmentsPortfolioInstrument.md) | An array of instruments that fall into the investment portfolio. |  [optional] |



