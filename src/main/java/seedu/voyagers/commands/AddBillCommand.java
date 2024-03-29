package seedu.voyagers.commands;

import seedu.voyagers.classes.Bill;
import seedu.voyagers.classes.TripList;
import seedu.voyagers.utils.TripStorage;
import seedu.voyagers.utils.Ui;

public class AddBillCommand extends Command {
    public AddBillCommand(String[] args){
        super(args);
    }

    public void execute(TripList trips, Ui ui, TripStorage tripStorage){

        try{
            Bill bill = new Bill(args);
        } catch (Exception e){
            ui.echo(e.getMessage());
        }

        //storage.writeTripFile(trips, trips.size());
    }

}
