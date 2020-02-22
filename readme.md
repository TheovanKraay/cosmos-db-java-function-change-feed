add a file local.settings.json with:

{
  "IsEncrypted": false,
  "Values": {
    "AzureWebJobsStorage": "UseDevelopmentStorage=true",
    "AzureCosmosDBConnection": "",
    "FUNCTIONS_WORKER_RUNTIME": "java"
  }
}
