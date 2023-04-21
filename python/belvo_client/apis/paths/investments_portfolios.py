from belvo_client.paths.investments_portfolios.get import ApiForget
from belvo_client.paths.investments_portfolios.post import ApiForpost
from belvo_client.paths.investments_portfolios.patch import ApiForpatch


class InvestmentsPortfolios(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
