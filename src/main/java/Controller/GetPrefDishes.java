package Controller;

import ObjectConversion.ReferenceStorage;
import Presenter.BookView;
import Search.PrefSearch;

public class GetPrefDishes implements GetOperation{
    PrefSearch searcher = new PrefSearch();

    public Object execute() {
        BookView.view(searcher.getResults(ReferenceStorage.dm.getDishes()));
        return null;
    }
}
