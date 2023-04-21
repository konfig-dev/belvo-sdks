from belvo_client.paths.api_balances.get import ApiForget
from belvo_client.paths.api_balances.post import ApiForpost
from belvo_client.paths.api_balances.patch import ApiForpatch


class ApiBalances(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
