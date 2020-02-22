Add a file local.settings.json with:

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
