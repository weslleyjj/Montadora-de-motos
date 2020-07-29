import * as React from "react";
import { List, Datagrid, TextField} from 'react-admin';

export const MotoList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id_moto" />
            <TextField source="modelo" />
            <TextField source="ano" />
            <TextField source="motor.id_motor" />
            <TextField source="registro.id_registro" />
        </Datagrid>
    </List>
);