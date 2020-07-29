import * as React from "react";
import {List, Datagrid, TextField, EditButton, Edit, SimpleForm, TextInput, Create} from 'react-admin';

export const PecaList = props => (
    <List {...props}>
        <Datagrid>
            <TextField source="id" />
            <TextField source="nome" />
            <TextField source="tipo" />
            <EditButton/>
        </Datagrid>
    </List>
);

export const PecaEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <TextInput disabled source="id" />
            <TextInput source="nome" />
            <TextInput source="tipo" />
        </SimpleForm>
    </Edit>
);

export const PecaCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="nome" />
            <TextInput source="tipo" />
        </SimpleForm>
    </Create>
);