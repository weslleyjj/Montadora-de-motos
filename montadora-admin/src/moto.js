import * as React from "react";
import { List, Datagrid, TextField} from 'react-admin';

export const MotoList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id" />
            <TextField source="modelo" />
            <TextField source="ano" />
            <TextField source="motor.id" />
            <TextField source="registro.id" />
        </Datagrid>
    </List>
);