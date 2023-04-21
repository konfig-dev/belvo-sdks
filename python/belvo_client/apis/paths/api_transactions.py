from belvo_client.paths.api_transactions.get import ApiForget
from belvo_client.paths.api_transactions.post import ApiForpost
from belvo_client.paths.api_transactions.patch import ApiForpatch


class ApiTransactions(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
