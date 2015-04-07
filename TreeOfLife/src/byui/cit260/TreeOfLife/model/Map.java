/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.TreeOfLife.model;

import java.io.Serializable;

/**
 *
 * @author Andrew
 */
public class Map implements Serializable {

    private int numberOfColumns;
    private int numberOfRows;
    private Location[][] locations;

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    public Map() {
    }

    public Map(int numberOfColumns, int numberOfRows) {
        this.numberOfColumns = numberOfColumns;
        this.numberOfRows = numberOfRows;
        
        this.locations = new Location [numberOfColumns][numberOfRows];
        
        for (int row = 0; row < numberOfRows; row++){
            for(int column = 0; column < numberOfColumns; column++){
                Location location = new Location();
                Scene scene = new Scene();
                location.setColumn(column);
                location.setRow(row);
                scene.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }



    @Override
    public String toString() {
        return "Points{" + "x=" + numberOfColumns + ", y=" + numberOfRows + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.numberOfColumns;
        hash = 29 * hash + this.numberOfRows;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.numberOfColumns != other.numberOfColumns) {
            return false;
        }
        if (this.numberOfRows != other.numberOfRows) {
            return false;
        }
        return true;
    }

    

}
