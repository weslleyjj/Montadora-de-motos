import * as React from "react";
import { List, Datagrid, TextField} from 'react-admin';

export const MotorList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id" />
            <TextField source="fabricacao" />
            <TextField source="cilindrada" />
        </Datagrid>
    </List>
);