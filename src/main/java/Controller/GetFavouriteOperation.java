package Controller;

import ObjectConversion.ReferenceStorage;

public class GetFavouriteOperation implements GetOperation {

    public Object execute() {
        return ReferenceStorage.u.getFavourites();
    }
}
