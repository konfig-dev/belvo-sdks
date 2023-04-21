from belvo_client.paths.api_incomes.get import ApiForget
from belvo_client.paths.api_incomes.post import ApiForpost
from belvo_client.paths.api_incomes.patch import ApiForpatch


class ApiIncomes(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
