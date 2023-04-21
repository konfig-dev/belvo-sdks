from belvo_client.paths.api_owners.get import ApiForget
from belvo_client.paths.api_owners.post import ApiForpost
from belvo_client.paths.api_owners.patch import ApiForpatch


class ApiOwners(
    ApiForget,
    ApiForpost,
    ApiForpatch,
):
    pass
