
Add a file local.settings.json at the root directory with the following (fill in AzureCosmosDBConnection):

```json
{
  "IsEncrypted": false,
  "Values": {
    "AzureWebJobsStorage": "UseDevelopmentStorage=true",
    "AzureCosmosDBConnection": "",
    "FUNCTIONS_WORKER_RUNTIME": "java"
  }
}
```
