package org.jcs.esjp.ui;

import java.text.DecimalFormat;
import java.util.List;

import org.jcs.esjp.model.ObjectPurchase;
import org.jcs.esjp.model.ObjectSale;
import org.jcs.esjp.model.Sector;
import org.jcs.esjp.model.StructureAbstract;
import org.jcs.esjp.model.StructureFactory;
import org.jcs.esjp.model.StructureNormal;
import org.jcs.esjp.model.StructureOther;
import org.zkoss.zul.Label;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listgroup;
import org.zkoss.zul.Listhead;
import org.zkoss.zul.Listheader;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Window;

public class PO_SectorData
    extends Window
{
    private Sector sector;

    public void onCreate() {
        sector = (Sector) getAttribute("sector");
        final Label label = new Label(sector.getName());
        label.setParent(this);

        buildStructureList();
    }

    protected void buildStructureList() {
        final Listbox lst = new Listbox();
        final Listhead lstHead = new Listhead();
        final Listheader lstHeader = new Listheader();
        lstHeader.setWidth("50px");
        lstHead.appendChild(lstHeader);
        lstHead.appendChild(new Listheader("Nombre"));
        lstHead.appendChild(new Listheader("Cantidad"));
        lstHead.appendChild(new Listheader("Precio"));
        lstHead.setParent(lst);

        final List<StructureAbstract> structures = sector.getLstStruct();
        for (final StructureAbstract struct : structures) {
            if (struct instanceof StructureNormal) {
                final Listgroup lstGroup = new Listgroup();
                lstGroup.setLabel(struct.getName());
                lstGroup.setValue(struct);
                lstGroup.setOpen(false);
                lstGroup.setParent(lst);
                for (final ObjectSale object : ((StructureNormal) struct).getObjSale()) {
                    final Listitem item = new Listitem();
                    final Listcell cell = new Listcell();
                    cell.setImage("images/sale.png");
                    item.appendChild(cell);
                    item.appendChild(new Listcell(object.getName()));
                    item.appendChild(new Listcell(getDecimalFormat(0, 0).format(object.getQuantity())));
                    item.appendChild(new Listcell(getDecimalFormat(0, 2).format(object.getPrice())));
                    item.setParent(lst);
                }
            } else if (struct instanceof StructureFactory) {
                final Listgroup lstGroup = new Listgroup();
                lstGroup.setLabel(struct.getName());
                lstGroup.setValue(struct);
                lstGroup.setOpen(false);
                lstGroup.setParent(lst);
                for (final ObjectSale object : ((StructureFactory) struct).getObjSale()) {
                    final Listitem item = new Listitem();
                    final Listcell cell = new Listcell();
                    cell.setImage("images/sale.png");
                    //cell.setWidth("10px");
                    item.appendChild(cell);
                    item.appendChild(new Listcell(object.getName()));
                    item.appendChild(new Listcell(getDecimalFormat(0, 0).format(object.getQuantity())));
                    item.appendChild(new Listcell(getDecimalFormat(0, 2).format(object.getPrice())));
                    item.setParent(lst);
                }
                for (final ObjectPurchase object : ((StructureFactory) struct).getObjPurch()) {
                    final Listitem item = new Listitem();
                    final Listcell cell = new Listcell();
                    cell.setImage("images/purchase.png");
                    item.appendChild(cell);
                    //cell.setWidth("10px");
                    item.appendChild(new Listcell(object.getName()));
                    item.appendChild(new Listcell(getDecimalFormat(0, 0).format(object.getQuantity())));
                    item.appendChild(new Listcell(getDecimalFormat(0, 2).format(object.getPrice())));
                    item.setParent(lst);
                }
            } else if (struct instanceof StructureOther) {

            } else {

            }
        }
        lst.setParent(this);
    }

    protected DecimalFormat getDecimalFormat(final int _minFraction,
                                             final int _maxFraction)
    {
        final DecimalFormat formatter = new DecimalFormat();
        formatter.setMaximumFractionDigits(_maxFraction);
        formatter.setMinimumFractionDigits(_minFraction);

        return formatter;
    }
}
