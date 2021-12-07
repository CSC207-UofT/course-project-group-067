package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Search.PrefSearch;

public class GetPrefDishes implements GetOperation{
    PrefSearch searcher = new PrefSearch();

    public Object execute() {
        return searcher.getResults(ReferenceStorage.dm.getDishes(), "");
    }
}
