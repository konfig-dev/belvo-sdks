from belvo_client.paths.api_accounts.get import ApiForget
from belvo_client.paths.api_accounts.post import ApiForpost
from belvo_client.paths.api_accounts.patch import ApiForpatch


class ApiAccounts(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
