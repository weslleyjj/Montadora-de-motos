import * as React from "react";
import {List, Datagrid, TextField, EditButton, Edit, SimpleForm, TextInput, NumberInput, Create} from 'react-admin';

export const MotoList = props => (
    <List {...props}>
        <Datagrid>
            <TextField source="id" />
            <TextField source="modelo" />
            <TextField source="ano" />
            <TextField source="motor.id" />
            <TextField source="registro.id" />
            <EditButton />
        </Datagrid>
    </List>
);

export const MotoEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <TextInput disabled source="id" />
            <TextInput source="modelo" />
            <NumberInput source="ano" />
            <TextInput source="motor" />
            <TextInput source="registro.id" />
        </SimpleForm>
    </Edit>
);

export const MotoCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="modelo" />
            <NumberInput source="ano" />
        </SimpleForm>
    </Create>
);


