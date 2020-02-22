package com.function;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Cosmos DB Trigger.
 */
public class Function {


    @FunctionName("cosmosDBMonitor")
    public void cosmosDbProcessor(
            @CosmosDBTrigger(name = "items", databaseName = "testdb", collectionName = "test", leaseCollectionName = "leases", createLeaseCollectionIfNotExists = true, connectionStringSetting = "AzureCosmosDBConnection") String[] items,
            final ExecutionContext context) {
                for (String string : items) {
                    System.out.println(string);
                    //context.getLogger().info("doc: "+string);
                }
        context.getLogger().info(items.length + "item(s) is/are changed.");
    }
}
