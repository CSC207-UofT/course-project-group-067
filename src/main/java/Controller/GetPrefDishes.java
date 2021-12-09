package Controller;

import ObjectConversion.ReferenceStorage;
import Search.PrefSearch;

public class GetPrefDishes implements GetOperation {
    final PrefSearch searcher = new PrefSearch();

    public Object execute() {
        return searcher.getResults(ReferenceStorage.dm.getDishes(), "");
    }
}
